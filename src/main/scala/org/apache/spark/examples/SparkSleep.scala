/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// scalastyle:off println
package org.apache.spark.examples

import java.time.Duration;

import org.apache.spark.sql.SparkSession

/** Sleeps for the purpose of external 
    baseline resource consumption measurements */
object SparkSleep {
  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("No-op Driver")
      .getOrCreate()
    spark.sparkContext
         .parallelize(1 to 10)
         .map(_ => Thread sleep Duration.ofHours(24).getSeconds())
         .collect()
    spark.stop()
  }
}
// scalastyle:on println
