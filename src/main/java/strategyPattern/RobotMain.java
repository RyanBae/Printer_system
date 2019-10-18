package strategyPattern;

import strategyPattern.Attack.MissileStrategy;
import strategyPattern.Attack.PunchStrategy;
import strategyPattern.robot.Atom;
import strategyPattern.robot.Robot;
import strategyPattern.robot.TaekwonV;

public class RobotMain {
    public static void main(String[] args) {
        Robot atom = new Atom("아톰");

        atom.setAttackStrategy(new MissileStrategy());

        System.out.println("My name is "+atom.getName());
        atom.attack();

        atom.setAttackStrategy(new PunchStrategy());
        atom.attack();
    }
}
