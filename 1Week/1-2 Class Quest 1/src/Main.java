//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Person man = new Person(age:30, name:"홍길동", gender:"남", married:True, child:3)

        man.setAge = //교수님 그냥 본인 코드만 적으면서 말하고 애들진도 못따라가는데 그냥 넘겨버리네 어이없어

                System.out.printf("나이는 %d살, 이름은 %s라는 %c가 있습니다.\n" +
                        "이 %s는 결혼을 했고 자식이 %d 있습니다\n", man.getAge(), man.getName(), man.getGender(), man.isMarried() ? "했" : "안 했", man.getChild());
    }
}