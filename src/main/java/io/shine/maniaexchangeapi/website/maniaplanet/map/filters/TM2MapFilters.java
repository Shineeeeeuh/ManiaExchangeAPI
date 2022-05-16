package io.shine.maniaexchangeapi.website.maniaplanet.map.filters;

public class TM2MapFilters {
    private String base;

    public TM2MapFilters(){
        base = "?";
    }

    public TM2MapFilters limit(int limit){
        base += "&limit="+limit;
        return this;
    }

    public TM2MapFilters page(int page){
        base += "&page="+page;
        return this;
    }



    @Override
    public String toString() {
        return base.replaceFirst("&", "");
    }
}
