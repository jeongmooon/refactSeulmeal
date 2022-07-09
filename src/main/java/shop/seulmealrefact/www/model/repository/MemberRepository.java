package shop.seulmealrefact.www.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.seulmealrefact.www.model.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {
}
