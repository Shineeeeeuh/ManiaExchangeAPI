package io.shine.maniaexchangeapi.website.maniaplanet.filters;

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




    @Override
    public String toString() {
        return base;
    }
}
