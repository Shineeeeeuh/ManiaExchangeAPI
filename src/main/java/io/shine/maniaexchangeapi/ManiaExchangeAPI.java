package io.shine.maniaexchangeapi;

import io.shine.maniaexchangeapi.website.maniaplanet.TM2Exchange;
import lombok.Getter;

@Getter
public class ManiaExchangeAPI {
    private final TM2Exchange TM2Exchange = new TM2Exchange();
}
