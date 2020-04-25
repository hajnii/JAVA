public class xxx {
    public static void main(String[] args) {
        String[] members = { "최진혁", "최유빈", "한이람" };
        int[] score = {80,20,30};
        for (int i = 0; i < members.length;i++) {
            String member = members[i];
            System.out.println(member + "님의 점수는" + score[i] + "입니다.");
            break;
        }
    }
}