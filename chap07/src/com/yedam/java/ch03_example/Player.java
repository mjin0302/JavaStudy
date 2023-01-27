package com.yedam.java.ch03_example;

public class Player {
	/* 문제) Player가 있고 이 Player가 게임을 합니다. 
	 * 게임에서 Player가 가지는 레벨에 따라 할 수 있는 세가지 기능이 있습니다. 생성자?
	 * 바로 run(), jump(), turn()입니다.
	 * 	- 초보자 레벨 : 천천히 달릴(run) 수 있습니다.
	 * 	- 중급자 레벨 : 빠르게 달리고(run) 점프할(jump) 수 있습니다.
	 * 	- 고급자 레벨 : 엄청 빠르게 달리고(run) 점프하고(jump) 턴할(turn) 수 있습니다.
	 * 
	 * 모든 레벨에서 Player가 사용할 수 있는 필살기인 go(int count)메서드를 제공합니다. 
	 * go()메서드는 한번 run하고 매개변수로 전달된 count만큼 jump하고, 한번 turn합니다.
	 * 그 레벨에서 불가능한 기능을 요청하면 할 수 없다는 메세지를 출력합니다.
	 * 
	 * 출력결과)
	 * beginner : go(1),
	 * advanced : go(2),
	 * super : go(3)
	 */
	
	// 필드
	private PlayerLevel level;
	
	//생성자
	public Player() {
		level = new BeginnerLevel();	//처음에 가져야 할 레벨의 정보 대입
		level.showLevelMessage();
	}
	
	//메소드
	public PlayerLevel getLevel() {
		return level;	//현재 플레이어의 레벨의 정보
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);	
	}
}
