package com.github.itzg.plugins;

import com.stumbleupon.async.Deferred;
import java.util.Map;
import net.opentsdb.core.TSDB;
import net.opentsdb.meta.Annotation;
import net.opentsdb.stats.StatsCollector;
import net.opentsdb.tsd.RTPublisher;

public class NoopRtPublisher extends RTPublisher {

  public void initialize(TSDB tsdb) {

  }

  public Deferred<Object> shutdown() {
    return Deferred.fromResult(null);
  }

  public String version() {
    return "1.0.0";
  }

  public void collectStats(StatsCollector statsCollector) {

  }

  public Deferred<Object> publishDataPoint(String s, long l, long l1, Map<String, String> map,
                                           byte[] bytes) {
    return Deferred.fromResult(null);
  }

  public Deferred<Object> publishDataPoint(String s, long l, double v, Map<String, String> map,
                                           byte[] bytes) {
    return Deferred.fromResult(null);
  }

  public Deferred<Object> publishAnnotation(Annotation annotation) {
    return Deferred.fromResult(null);
  }
}
