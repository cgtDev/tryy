package yks.mytry;

import org.kohsuke.args4j.Option;

/** java -jar -est false -name linux
 * Created by cgt on 18-1-26.
 */
public class SampleCmdOption {
    @Option(name="-est", usage="Specify whether we want to estimate model from scratch")
    public String est = "false";

    @Option(name="-name", usage="Specify the name")
    public String name = "liux";
}
