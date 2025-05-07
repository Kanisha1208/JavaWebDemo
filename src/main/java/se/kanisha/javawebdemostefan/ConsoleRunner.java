package se.kanisha.javawebdemostefan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.kanisha.javawebdemostefan.models.HockeyPlayer;
import se.kanisha.javawebdemostefan.models.HockeyPlayerRepository;


@Component
public class ConsoleRunner implements CommandLineRunner {


    @Autowired
    HockeyPlayerRepository hockeyPlayerRepository;

    @Override
    public void run(String... args) throws Exception {
        if(hockeyPlayerRepository.count() == 0) {
            HockeyPlayer hockeyPlayer = new HockeyPlayer();
            hockeyPlayer.setAge(32);
            hockeyPlayer.setName("Friberg");
            hockeyPlayerRepository.save(hockeyPlayer);

            hockeyPlayer = new HockeyPlayer();
            hockeyPlayer.setAge(30);
            hockeyPlayer.setName("Raymond");
            hockeyPlayerRepository.save(hockeyPlayer);

        }
        // kolla om count(*) = 0
        // insert into hockey player
    }
}
