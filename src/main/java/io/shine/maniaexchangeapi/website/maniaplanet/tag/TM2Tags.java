package io.shine.maniaexchangeapi.website.maniaplanet.tag;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@AllArgsConstructor
public enum TM2Tags {
    //BASED ON https://tm.mania.exchange/api/tags/gettags

    Race(1, "Race", ""),
    FullSpeed(2, "FullSpeed", ""),
    Tech(3, "Tech", ""),
    RPG(4, "RPG", ""),
    LOL(5, "LOL", ""),
    PF(6, "Press Forward", ""),
    SpeedTech(7, "Speedtech", ""),
    MultiLap(8, "MultiLap", ""),
    OffRoad(9, "Offroad", "805000"),
    Trial(10, "Trial", ""),
    Mixed(11, "Mixed", ""),
    ZrT(12, "ZrT", "0e9e00"),
    Nascar(13, "Nascar", "ac0000"),
    SpeedFun(14, "SpeedFun", ""),
    Dirt(15, "Dirt", "5a4200"),
    Stunt(16, "Stunt", ""),
    Platform(17, "Platform", ""),
    Bumper(18, "Bumper", ""),
    Scenery(19, "Scenery", ""),
    Kacky(20, "Kacky", ""),
    Endurance(21, "Endurance", ""),
    Water(22, "Water", "0087bc"),
    Remake(23, "Remake", ""),
    Mini(24, "Mini", ""),
    SpeedDrift(25, "SpeedDrift", ""),
    MiniGame(26, "MiniGame", ""),
    Obstacle(27, "Obstacle", ""),
    Transitional(28, "Transitional", ""),
    Grass(29, "Grass", "00a607"),
    Competitive(30, "Competitive", ""),
    Ice(31, "Ice", "0a8885"),
    Glass(32, "Glass", ""),
    Backwards(33, "Backwards", ""),
    Freewheel(34, "Freewheel", "f34247"),
    Signature(35, "Signature", "edc12f"),
    Freestyle(36, "Freestyle", ""),
    Wood(37, "Wood", "");

    @Getter
    private int id;
    @Getter
    private String name, color;

    public static Optional<TM2Tags> getTag(int id){
        return Arrays.stream(values()).filter(tag -> id == tag.getId()).findFirst();
    }
}
