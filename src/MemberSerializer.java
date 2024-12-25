public class MemberSerializer {

  /**
   * Serializes a Member object to JSON format.
   *
   * @param member the Member object to serialize
   * @return the JSON representation of the Member object
   */
  public static String toJson(Member member) {
    return String.format("{\"id\": \"%s\", \"name\": \"%s\", \"membershipDate\": \"%s\"}",
        member.getMemberId(), member.getName(), member.getMembershipDate());
  }

  /**
   * Serializes a Member object to XML format.
   *
   * @param member the Member object to serialize
   * @return the XML representation of the Member object
   */
  public static String toXml(Member member) {
    return String.format("<member><id>%s</id><name>%s</name><membershipDate>%s</membershipDate></member>",
        member.getMemberId(), member.getName(), member.getMembershipDate());
  }
}