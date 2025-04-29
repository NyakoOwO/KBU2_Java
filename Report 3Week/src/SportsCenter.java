class SportsCenter {
    private Sports[] members;

    public SportsCenter(Sports[] members) {
        this.members = members;
    }

    public void display() {
        System.out.printf("----------------------------------------------------------------------------------------\n" +
                        "%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n" +
                        "----------------------------------------------------------------------------------------\n",
                "회원번호", "이름", "등급", "운동종류명", "사용시간", "기본요금", "납부요금", "보너스");
        for (Sports member : members) {
            member.display();
        }
        System.out.print("----------------------------------------------------------------------------------------");
    }
}