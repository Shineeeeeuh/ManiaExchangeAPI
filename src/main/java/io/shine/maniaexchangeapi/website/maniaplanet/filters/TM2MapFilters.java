package io.shine.maniaexchangeapi.website.maniaplanet.filters;

import io.shine.maniaexchangeapi.website.maniaplanet.difficulty.TM2Difficulties;
import io.shine.maniaexchangeapi.website.maniaplanet.tag.TM2Tags;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TM2MapFilters {
    private String base;

    public TM2MapFilters(){
        base = "";
    }

    public TM2MapFilters limit(int limit){
        base += "&limit="+limit;
        return this;
    }

    public TM2MapFilters page(int page){
        base += "&page="+page;
        return this;
    }

    public TM2MapFilters name(String name){
        base += "&trackname="+name;
        return this;
    }

    public TM2MapFilters author(String author){
        base += "&author="+author;
        return this;
    }

    public TM2MapFilters tags(TM2Tags... tags){
        base += "&tags="+Arrays.stream(tags).map(tag -> String.valueOf(tag.getId())).collect(Collectors.joining(","));
        return this;
    }

    public TM2MapFilters difficulty(TM2Difficulties difficulty){
        base +="&difficulty="+difficulty.getValue();
        return this;
    }

    @Override
    public String toString() {
        return base;
    }

}
