package rs.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbaseSeeder implements CommandLineRunner {
    private MemberRepository memberRepository;

    public DbaseSeeder(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Member anna = new Member("Anna", "Konyhova","1990.08.07",34500);
        Member kolya = new Member("Nikolai", "Tkachenko","1993.05.17",65500);
        Member john = new Member("John", "McDakowka","1988.10.03",90293);

        this.memberRepository.deleteAll();
        List<Member> hotels = Arrays.asList(anna, kolya, john);
        this.memberRepository.saveAll(hotels);
    }
}
