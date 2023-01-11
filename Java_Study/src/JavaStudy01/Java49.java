package JavaStudy01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 Stack
 후입선출(LIFO) 구조
 메서드 : push(E item)-스택에 넣기, peek()-맨위 객체를 가져오고 제거하진 않음, pop()-맨위 객체를 가져오고 제거함
 
 Queue
 선입선출(FIFO) 구조
 메서드 : offer(E e)-주어진 객체를 넣음, peek()-먼저 들어간 것 하나 가져오며 제거하진 않음, poll()-먼저 들어간 것 하나를 가져오며 제거함
 */

public class Java49 {

	public static void main(String[] args) {

//		스택 예시
		Stack<Java49_1> coinBox = new Stack<>();
		
		coinBox.push(new Java49_1(100));
		coinBox.push(new Java49_1(50));
		coinBox.push(new Java49_1(500));
		coinBox.push(new Java49_1(10));
		
		
		while(!coinBox.isEmpty()) {
			Java49_1 coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		
		
//		큐 예시
		Queue<Java49_2> msgQueue = new LinkedList<>();
		
		msgQueue.offer(new Java49_2("sendMail","홍길동"));
		msgQueue.offer(new Java49_2("sendSMS","아이유"));
		msgQueue.offer(new Java49_2("sendKaKao","장보고"));
		
		while(!msgQueue.isEmpty()) {
			Java49_2 msg = msgQueue.poll();
			
			switch(msg.command) {
			case "sendMail" :
				System.out.println(msg.to + "님에게 이메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(msg.to + "님에게 문자를 보냅니다.");
				break;
			case "sendKaKao" :
				System.out.println(msg.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}

	}

}
