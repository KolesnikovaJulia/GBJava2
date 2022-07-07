package lesson1;

import java.util.Random;

public class Cat implements Participant {

    @Override
    public String name() {
        return "Кот";
    }

    @Override
    public void run() {
        int runner = new Random().nextInt(30, 120);
        while (runner > Treadmill.LENGTH){
            System.out.printf("%s пробежал %d м и преодолел препятствие %s! %n ", name(), runner, Treadmill.TITLE);
            if (runner < Treadmill.LENGTH)
                System.out.printf("%s пробежал %d м, не справился с препятствием %s и выбывает из соревнования! %n", name(), runner, Treadmill.TITLE);
                break;
            }
    }

    @Override
    public void jump() {
        int jumper = new Random().nextInt(2,5);
        if (jumper > Wall.HEIGHT){
            System.out.printf("%s подпрыгнул на %d м и перепрыгнул препятствие %s! %n ", name(), jumper, Wall.TITLE);
        }else {
            System.out.printf("%s подпрыгнул на %d м, не справился с препятствием %s и выбывает из соревнования! %n ", name(), jumper, Wall.TITLE);
        }

    }
}
