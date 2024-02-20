package ch06.quiz16;

public class Marine {
    int x= 0, y = 0; // Marine의 위치좌표
    int hp = 60;
    static int weapon = 6;
    static int armor = 0;

    //1. 공격력 증가시키는 메소드
    void weaponUp() {
        weapon++;
    }
    //2. 방어력 증가시키는 메소드
    void armorUp() {
        armor++;
    }
    //3. 캐릭터의 위치 움직이는 메소드
    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y;
    }
}
