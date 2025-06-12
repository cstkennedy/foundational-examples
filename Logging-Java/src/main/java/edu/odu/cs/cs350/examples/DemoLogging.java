package edu.odu.cs.cs350.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Demonstrate how to set up logging with slf4j and tinylog
 */
class LoggingDemo
{
    /**
     * This is a main function.
     * <p>
     * Top-down Design (which you should recall from CS 250)
     * states that the main function does next-to-no work
     * other than maintaining variables and calling other functions.
     *
     * I often amend this rule to include basic input validation
     */
    public static void main(String... args)
        throws InterruptedException
    {
        Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

        logger.info("starting simulation!");

        for (int i = 1; i <= 100; ++i) {
            switch (i) {
                case 5 -> {
                    logger.debug("this is taking so long... boooring!");
                }
                case 10 -> {
                    logger.debug("still alive! yay!");
                }
                case 15 -> {
                    logger.info("halfway there!");
                }
                case 20 -> {
                    logger.debug("*scratches nose*");
                    logger.warn("nose is itching, continuing anyways");
                }
                case 50 -> {
                    logger.debug("uh oh");
                    logger.warn(">nose itching intensifies");
                    logger.error("HATCHOOO!");
                    logger.debug("encountered minor problem, trying to recover");
                    logger.info("gesundheit");
                    logger.debug("recovered from minor problem, continuing");
                }
                case 100 -> {
                    logger.info("successfully loaded nothing");
                    logger.info("have a good time!");
                }
            }

            // Sleep for 100 milliseconds
            Thread.sleep(100);
        }
    }
}
