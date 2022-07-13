package JPABook.JPAService;

import JPABook.JPAStart.Member;

import javax.persistence.EntityManager;
import java.util.List;

public class StarterService {
    public void logic(EntityManager entityManager) {
        String id = "id1";
        Member member = Member.builder()
                .id(id)
                .userName("kimsunho")
                .age(32)
                .build();

        entityManager.persist(member);

        member.setAge(20);

        Member findMember = entityManager.find(Member.class, id);

        System.out.println("findMember = "
                + findMember.getUserName()
                + ", age="
                + findMember.getAge());

        List<Member> members = entityManager.createQuery("select m from Member m", Member.class).getResultList();

        System.out.println("members.size() = " + members.size());

        entityManager.remove(member);
    }
}
