package com.example.demo.games;


import com.example.demo.appUser.AppUser;
import com.example.demo.appUser.AppUserService;
import com.example.demo.appUser.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(path = "api/v1/games")
public class GamesController {
   private final UserRepository userRepository;
   private final AppUserService appUserService;
   private final GamesService gamesService;
    @Autowired
    public GamesController(UserRepository userRepository, AppUserService appUserService, GamesService gamesService) {
        this.userRepository = userRepository;
        this.appUserService = appUserService;
        this.gamesService = gamesService;
    }

    @PostMapping("rock")
    public void registerNewUser( @RequestBody GamesClass game){
        AppUser app2=appUserService.getUser();
        app2.setScore(gamesService.rps(game.getPlayer1(), game.getPlayer2()));
        appUserService.saveAppUser(app2);


    }
    @PostMapping("Number")
    public Double Number( @RequestBody moveGame game){
        AppUser app=appUserService.getUser();
        Double SCORE=gamesService.towerHanoi(game.getNumber());
       app.setNumberscore( SCORE);

      return SCORE;

    }
    @PostMapping("Dice")
    public Integer Dice( @RequestBody Dice game){
        AppUser app=appUserService.getUser();
      Integer score=  gamesService.diceScore(game.getList());
        app.setDiceScore(score );

        return score;

    }
    @PostMapping("watergras")
    public double warergrass( @RequestBody firewater game){

        double score= gamesService.calculateDamage(game.getYourType(),game.getOpponentType(),game.getAttack(),game.getDefense());


        return score;

    }










}
