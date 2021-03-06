package cz.cvut.felk.cig.jcool.core;

/**
 * Created by IntelliJ IDEA.
 * User: SuperLooser
 * Date: 23.1.2011
 * Time: 17:16:54
 * To change this template use File | Settings | File Templates.
 * Unified interface for used random number generators.
 */
public interface RandomGenerator {
    /**
     * Sets seed for random generator.
     * @param seed - seed for random generator.
     */
    void setSeed(int seed);

    /**
     * Returns randomly generated double in range 0.0d (inclusive) to 1.0d (exclusive).
     * @return randomly generated double in range 0.0d (inclusive) to 1.0d (exclusive).
     */
    double nextRandom();

    /**
     * Returns randomly generated uniformly distributed true and false value.
     * @return randomly generated uniformly distributed true and false value.
     */
    boolean nextBoolean();

    /**
     * Returns randomly generated true and false value with given probability of true value.
     * @param probability - probability of value true.
     * @return randomly generated true and false value with given probability of true value.
     */
    boolean nextBoolean(double probability);

    /**
     * Returns randomly generated byte in range <Byte.MIN_VALUE, Byte.MAX_VALUE>
     * @return randomly generated byte in range <Byte.MIN_VALUE, Byte.MAX_VALUE>
     */
    byte nextByte();

    /**
     * Returns randomly generated byte in range <0, maxExclusive)
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated byte in range <0, maxExclusive)
     */
    byte nextByte(byte maxExclusive);

    /**
     * Returns randomly generated byte in range <minInclusive, maxExclusive)
     * @param minInclusive - the smallest value which can be included in result value.
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated byte in range <minInclusive, maxExclusive)
     */
    byte nextByte(byte minInclusive, byte maxExclusive);

    /**
     * Returns randomly generated integer in full scale.
     * @return randomly generated integer in full scale.
     */
    int nextInt();

    /**
     * Returns randomly generated integer in range <0, maxExclusive)
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated integer in range <0, maxExclusive)
     */
    int nextInt(int maxExclusive);

    /**
     * Returns randomly generated integer in range <minInclusive, maxExclusive)
     * @param minInclusive - the smallest value which can be included in result value.
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated integer in range <minInclusive, maxExclusive)
     */
    int nextInt(int minInclusive, int maxExclusive);

    /**
     * Returns randomly generated long in full scale.
     * @return randomly generated long in full scale.
     */
    long nextLong();

    /**
     * Returns randomly generated long in range <0, maxExclusive)
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated long in range <0, maxExclusive)
     */
    long nextLong(long maxExclusive);

    /**
     * Returns randomly generated long in range <minInclusive, maxExclusive)
     * @param minInclusive - the smallest value which can be included in result value.
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated long in range <minInclusive, maxExclusive)
     */
    long nextLong(long minInclusive, long maxExclusive);

    /**
     * Returns randomly generated float in range < 0.0, 1.0)
     * @return randomly generated float in range < 0.0, 1.0)
     */
    float nextFloat();

    /**
     * Returns randomly generated float in range <0.0, maxExclusive)
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated float in range <0.0, maxExclusive)
     */
    float nextFloat(float maxExclusive);

    /**
     * Returns randomly generated float in range <minInclusive, maxExclusive)
     * @param minInclusive - the smallest value which can be included in result value.
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated float in range <minInclusive, maxExclusive)
     */
    float nextFloat(float minInclusive, float maxExclusive);

    /**
     * Returns randomly generated double in range < 0.0, 1.0)
     * @return randomly generated double in range < 0.0, 1.0)
     */
    double nextDouble();

    /**
     * Returns randomly generated double in range < 0.0, maxExclusive)
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated double in range < 0.0, maxExclusive)
     */
    double nextDouble(double maxExclusive);

    /**
     * Returns randomly generated double in range < minInclusive, maxExclusive)
     * @param minInclusive - the smallest value which can be included in result value.
     * @param maxExclusive - the smallest of the biggest numbers that won't be included in return value.
     * @return randomly generated double in range < minInclusive, maxExclusive)
     */
    double nextDouble(double minInclusive, double maxExclusive);

    /**
     * Returns pseudo-random, Gaussian ("normally") distributed double value with mean 0.0 and standard deviation 1.0 from this random number generator's sequence.
     * @return pseudo-random, Gaussian ("normally") distributed double value with mean 0.0 and standard deviation 1.0 from this random number generator's sequence.
     */
	double nextGaussian();

    /**
     * Returns pseudo-random, Gaussian ("normally") distributed double value with given mean and given deviation.
     * @param mean - mean for gaussian distribution.
     * @param standardDeviation - standard deviation of gaussian distribution.
     * @return pseudo-random, Gaussian ("normally") distributed double value with given mean and given deviation.
     */
	double nextGaussian(double mean, double standardDeviation);
}
