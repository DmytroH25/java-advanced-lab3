/**
 * Represents a library member with a member ID, name, and membership date.
 */
@XmlJsonRoot("member")
public class Member {

  @XmlJsonField("memberId")
  private String memberId;

  @XmlJsonField("name")
  private String name;

  @XmlJsonField("membershipDate")
  private String membershipDate;

  /**
   * Constructs a new Member with the specified member ID, name, and membership date.
   *
   * @param memberId       the ID of the member
   * @param name           the name of the member
   * @param membershipDate the membership date of the member
   */
  public Member(String memberId, String name, String membershipDate) {
    this.memberId = memberId;
    this.name = name;
    this.membershipDate = membershipDate;
  }


  // Getters
  public String getMemberId() {
    return memberId;
  }

  public String getName() {
    return name;
  }

  public String getMembershipDate() {
    return membershipDate;
  }

}