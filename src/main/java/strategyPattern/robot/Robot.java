package strategyPattern.robot;

import strategyPattern.Attack.AttackStrategy;

public abstract class Robot {
    private String name;
    private AttackStrategy attackStrategy;

    public Robot(String name ){
        this.name = name;
    }

    public void attack(){
        attackStrategy.attack();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
