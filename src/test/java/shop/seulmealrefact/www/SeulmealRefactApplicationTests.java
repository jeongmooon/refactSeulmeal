package shop.seulmealrefact.www;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shop.seulmealrefact.www.model.entity.Member;
import shop.seulmealrefact.www.model.repository.MemberRepository;

@SpringBootTest
class SeulmealRefactApplicationTests {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void contextLoads() {
        Member member = new Member();
    }

}
