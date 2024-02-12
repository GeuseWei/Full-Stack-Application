package com.todayilearned.backend;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private FactRepository factRepository;

    @Override
    public void run(String... args) throws Exception {
        // 创建并保存一些初始数据
        addFact("The shortest war in history lasted 38 minutes! It was between Britain and Zanzibar on August 27, 1896. It was over the ascension of the next Sultan in Zanzibar and resulted in a British victory.",
        "https://www.historic-uk.com/HistoryUK/HistoryofBritain/The-Shortest-War-in-History/",
        "history", 15, 8, 2);

        addFact("The first 1GB hard drive was made in 1980 and had a price of $40,000!",
        "https://www.autodesk.com/products/fusion-360/blog/a-look-back-at-the-first-built-in-hard-drive/",
        "history", 4, 1, 0);

        addFact("\"typewriter\" is the longest English word you can type using 1 row of the QWERTY keyboard",
                "https://twitter.com/intel/status/442074967522684928",
                "technology", 9, 1, 0);

        addFact("Human DNA is 99.9% identical from person to person",
                "https://www.genome.gov/about-genomics/fact-sheets/Genetics-vs-Genomics",
                "science", 4, 9, 1);

        addFact("The less money you spend, the more you save!",
                "https://bettermoneyhabits.bankofamerica.com/en/saving-budgeting/ways-to-save-money",
                "finance", 2, 1, 0);

        addFact("Millennial dads spend 3 times as much time with their kids than their fathers spent with them. In 1982, 43% of fathers had never changed a diaper. Today, that number is down to 3%",
                "https://www.mother.ly/parenting/millennial-dads-spend-more-time-with-their-kids/?rebelltitem=1#rebelltitem1",
                "society", 12, 2, 0);

        addFact("There is enough DNA in the average person’s body to stretch from the sun to Pluto and back — 17 times",
                "https://skeptics.stackexchange.com/questions/10606/length-of-uncoiled-human-dna",
                "science", 6, 13, 2);

        addFact("React was developed by Google",
                "https://example.com",
                "technology", 1, 0, 9);

        addFact("As of 2023, Breaking Bad is the highest-rated TV show on IMDb with a rating of 9.4/10",
                "https://www.imdb.com/chart/toptv/",
                "entertainment", 11, 5, 2);

        addFact("Lisbon is the capital of Portugal",
                "https://en.wikipedia.org/wiki/Lisbon",
                "society", 8, 3, 1);

        addFact("React is being developed by Meta (formerly facebook)",
                "https://opensource.fb.com/",
                "technology", 24, 9, 4);

        // 可以添加更多的初始化数据
    }
    private void addFact(String text, String source, String category, int votesInteresting, int votesMindblowing, int votesFalse) {
        Fact fact = new Fact();
        fact.setText(text);
        fact.setSource(source);
        fact.setCategory(category);
        fact.setVotesInteresting(votesInteresting);
        fact.setVotesMindblowing(votesMindblowing);
        fact.setVotesFalse(votesFalse);
        factRepository.save(fact);
    }
}
