package ch14;

public class quiz0102 {
    /*
    1. 프로세스: 현재 진행중인 프로그램
    스레드: 프로세스 내부에서 진행되는 멀티 태스킹
    2. 병렬로 mainThread와 thread-1이 시작된다.
    mainThread는 작업속도가 빨라 먼저 실행되고, 같이 실행되던 thread-1은 이후 실행된다.
    둘다 종료되면 프로세스가 종료된다.
    => main스레드와 thread1이 실행되지만 thread1은 2초에 한번씩 실행되므로
    main스레드의 결과보다 늦게 출력이 된다.
     */
}
