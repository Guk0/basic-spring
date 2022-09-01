package hello.core.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
        // 생성자를 통해 추상화(interface)에만 의존하게함.
        // -> 생성자 주입
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 싱글턴 테스트 용도. 한번만 initializing 되는가?
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
