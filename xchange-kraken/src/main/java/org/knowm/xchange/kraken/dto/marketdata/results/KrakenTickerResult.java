package org.knowm.xchange.kraken.dto.marketdata.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.kraken.dto.KrakenResult;
import org.knowm.xchange.kraken.dto.marketdata.KrakenTicker;

import java.util.Map;

/**
 * @author Raphael Voellmy
 */
public class KrakenTickerResult extends KrakenResult<Map<String, KrakenTicker>> {

  /**
   * Constructor
   *
   * @param result The ticker data
   * @param error  List of errors
   */
  public KrakenTickerResult(@JsonProperty("error") String[] error, @JsonProperty("result") Map<String, KrakenTicker> result) {

    super(result, error);
  }
}
