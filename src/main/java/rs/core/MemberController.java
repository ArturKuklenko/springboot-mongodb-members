package rs.core;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    private MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @GetMapping("/all")
    public List<Member> getAll(){
        List<Member> hotels = this.memberRepository.findAll();
        return hotels;
    }
    @PutMapping
    public void insert(@RequestBody Member member){
        this.memberRepository.insert(member);
    }
    @PostMapping
    public void update(@RequestBody Member member){
        this.memberRepository.save(member);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        this.memberRepository.deleteById(id);
    }
}
