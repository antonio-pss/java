package app;

import absModel.AbsForm;
import model.*;
import view.SecondWindow;
import view.Swing;
import java.time.LocalTime;

public class Main {
    static AbsForm[] form = {new Circle(5), new Circle(2), new Rect(10, 7), new Rect(3, 5), new SubSquare(4)};

    public static void main(String[] args) {
        /* Student and Course
        SchoolView schoolView = new SchoolView();
        schoolView.menu();
        */


        /* Abstract Form
        for (AbsForm f : form) {
            System.out.println("\n" + f.toString());
            System.out.println("Area = " + f.calcArea());
            System.out.println("Perimeter = " + f.calcPerimeter());
        }
        */

        /* RadioClock
        RadioClock radioClock = new RadioClock();
        radioClock.setTime(LocalTime.of(9, 10, 55));
        radioClock.setAlarmTime(LocalTime.of(12, 10));
        radioClock.setClockVolume(10);
        radioClock.setRadioVolume(5);
        radioClock.setBroadcaster(new Broadcaster("RadioQualquer"));
        radioClock.setBroadcasterType("FM");
        radioClock.startClok();
        System.out.println(radioClock);
        */

        SecondWindow window = new SecondWindow();
        window.setVisible(true);
    }
}
