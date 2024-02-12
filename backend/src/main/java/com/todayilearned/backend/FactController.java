package com.todayilearned.backend;

import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facts")
public class FactController {

    @Autowired
    private FactRepository factRepository;

    @GetMapping
    public List<Fact> getFacts(@RequestParam(name = "category", required = false) String category) {
        Sort sort = Sort.by(Sort.Direction.DESC, "votesInteresting"); // 定义排序方式
        if (category != null && !category.equalsIgnoreCase("all")) {
            return factRepository.findByCategory(category, sort);
        } else {
            return factRepository.findAll(sort);
        }
    }

	 record NewFactRequest(
		String text,
		String source,
		String category
    ){}

    @PostMapping
    public ResponseEntity<Fact> addFact(@RequestBody NewFactRequest request){
    Fact fact = new Fact();
    fact.setText(request.text());
    fact.setSource(request.source());
    fact.setCategory(request.category());
    Fact savedFact = factRepository.save(fact);
    return ResponseEntity.ok(savedFact); // 返回保存的 Fact 对象
    }

    @SuppressWarnings("null")
    @PostMapping("/vote/{factId}/{columnName}")
    public ResponseEntity<Fact> vote(@PathVariable Integer factId, @PathVariable String columnName) {
        Optional<Fact> factOptional = factRepository.findById(factId);

        if (factOptional.isPresent()) {
            Fact fact = factOptional.get();
            switch (columnName) {
                case "votesInteresting":
                    fact.setVotesInteresting(fact.getVotesInteresting() + 1);
                    break;
                case "votesMindblowing":
                    fact.setVotesMindblowing(fact.getVotesMindblowing() + 1);
                    break;
                case "votesFalse":
                    fact.setVotesFalse(fact.getVotesFalse() + 1);
                    break;
                default:
                    return ResponseEntity.badRequest().build(); // 无效的 columnName
            }

            Fact updatedFact = factRepository.save(fact);
            return ResponseEntity.ok(updatedFact);
        } else {
            return ResponseEntity.notFound().build(); // 找不到 Fact
        }
    }
}
