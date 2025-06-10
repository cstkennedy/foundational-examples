import logging
import time

import coloredlogs


def set_up_logging(global_level: str = "DEBUG") -> None:
    coloredlogs.install(level=global_level)


def main() -> None:
    set_up_logging("DEBUG")
    logger = logging.getLogger(__name__)

    logger.info("starting simulation!")

    for i in range(1, 101):
        match i:
            case 5:
                logger.debug("this is taking so long... boooring!")
            case 10:
                logger.debug("still alive! yay!")
            case 15:
                logger.info("halfway there!")
            case 20:
                logger.debug("*scratches nose*")
                logger.warning("nose is itching, continuing anyways")
            case 50:
                logger.debug("uh oh")
                logger.warning(">nose itching intensifies")
                logger.error("HATCHOOO!")
                logger.debug("encountered minor problem, trying to recover")
                logger.info("gesundheit")
                logger.debug("recovered from minor problem, continuing")
            case 100:
                logger.info("successfully loaded nothing")
                logger.info("have a good time!")

        # Sleep for 100 milliseconds
        time.sleep(0.1)


if __name__ == "__main__":
    main()
