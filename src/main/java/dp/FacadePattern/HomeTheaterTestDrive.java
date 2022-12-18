package dp.FacadePattern;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        MyHWInfo myHWInfo = new MyHWInfo();
        myHWInfo.printInfo();
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner,
                dvd, cd, projector, screen, lights, popper);
        System.out.println();
        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println();
        homeTheater.endMovie();
    }
}
