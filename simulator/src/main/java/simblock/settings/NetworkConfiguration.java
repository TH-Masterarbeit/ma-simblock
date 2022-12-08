/*
 * Copyright 2019 Distributed Systems Group
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package simblock.settings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Network configuration allows to configure network latency and
 * bandwidth.
 */
public class NetworkConfiguration {
    /**
     * Regions where nodes can exist.
     */
    public static final List<String> REGION_LIST = new ArrayList<>(
            Arrays.asList("NORTH_AMERICA", "EUROPE"));

    /**
     * LATENCY[i][j] is average latency from REGION_LIST[i] to REGION_LIST[j]
     * Unit: millisecond, for year 2019
     */
    private static final long[][] LATENCY_2019 = {
            { 32, 124 },
            { 124, 11 },
    };

    /**
     * List of latency assigned to each region. (unit: millisecond)
     */
    public static final long[][] LATENCY = LATENCY_2019;

    /**
     * List of download bandwidth assigned to each region, and last element is
     * Inter-regional
     * bandwidth. (unit: bit per second) for year 2019
     */
    private static final long[] DOWNLOAD_BANDWIDTH_2019 = {
            52000000, 40000000
    };

    /**
     * List of download bandwidth assigned to each region, and last element is
     * Inter-regional
     * bandwidth. (unit: bit per second)
     */
    public static final long[] DOWNLOAD_BANDWIDTH = DOWNLOAD_BANDWIDTH_2019;

    /**
     * List of upload bandwidth assigned to each region. (unit: bit per second), and
     * last element
     * is Inter-regional bandwidth for year 2019
     */
    private static final long[] UPLOAD_BANDWIDTH_2019 = {
            19200000, 20700000
    };

    /**
     * List of upload bandwidth assigned to each region. (unit: bit per second), and
     * last element
     * is Inter-regional bandwidth.
     */
    public static final long[] UPLOAD_BANDWIDTH = UPLOAD_BANDWIDTH_2019;

    /**
     * Region distribution Bitcoin 2019.
     */
    private static final double[] REGION_DISTRIBUTION_BITCOIN_2019 = {
            0.5, 0.5
    };

    /**
     * The distribution of node's region. Each value means the rate of the number of
     * nodes in the
     * corresponding region to the number of all nodes.
     */
    public static final double[] REGION_DISTRIBUTION = REGION_DISTRIBUTION_BITCOIN_2019;

    /**
     * The cumulative distribution of number of outbound links for Bitcoin 2015.
     */
    private static final double[] DEGREE_DISTRIBUTION_BITCOIN_2015 = {
            1,
    };

    /**
     * The cumulative distribution of number of outbound links. Cf. Andrew Miller et
     * al.,
     * "Discovering bitcoin's public topology and influential nodes", 2015.
     */
    public static final double[] DEGREE_DISTRIBUTION = DEGREE_DISTRIBUTION_BITCOIN_2015;
}