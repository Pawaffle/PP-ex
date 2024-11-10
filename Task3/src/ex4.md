# Probability Distributions

---

## Task 1.3.4 

Familiarize yourself with a few distributions that could be used in the simulator for experimentation. These distributions could be used in the following situations. Find answers online. You can also study other distributions. For example, Google "real life example of normal distribution".

---

## Introduction

In simulation, probability distributions are essential for modeling real-world randomness and variability. Each distribution can represent specific types of events or measurements in a simulation, making it possible to replicate real-life processes in a controlled environment. This document explores common probability distributions and provides examples of how they can be used in simulations to model everyday situations.

---

## Distributions and Real-Life Applications

### 1. **Normal Distribution**

- **Description**: The normal distribution, also known as the "bell curve," models values that cluster around a mean, with decreasing probability for values further from the mean.
- **Application**: Commonly used to model natural phenomena and measurements, such as height, weight, test scores, and measurement errors.
- **Example**: Human height, where most people have an average height, and very short or very tall heights are rare.
- **Simulation Use**: Ideal for modeling variables with variations around a central value, like product quality in manufacturing or student grades.


### 2. **Exponential Distribution**

- **Description**: The exponential distribution describes the time between events in a process where events occur at a constant average rate.
- **Application**: Used to model waiting times until the next event in a Poisson process, such as the arrival of customers.
- **Example**: Waiting time for a bus, where buses arrive, on average, every 10 minutes.
- **Simulation Use**: Useful for modeling time until events in queuing systems, like time between calls in a call center or customer arrivals at a service counter.


### 3. **Binomial Distribution**

- **Description**: The binomial distribution models the number of successes in a series of independent trials, where each trial has only two possible outcomes: success or failure.
- **Application**: Often used in scenarios with a fixed number of trials, such as determining the likelihood of a specific number of favorable outcomes.
- **Example**: Flipping a coin 10 times to count the number of "heads" (success) vs. "tails" (failure).
- **Simulation Use**: Suitable for experiments where the number of successful outcomes in a set of trials is important, such as quality control or game results.


### 4. **Poisson Distribution**

- **Description**: The Poisson distribution describes the number of events occurring in fixed intervals of time or space, especially when events are rare and random.
- **Application**: Used to model the occurrence of rare events over time or space, such as the number of calls received at a help desk per hour.
- **Example**: The number of cars passing through an intersection in a minute, especially when traffic flow is irregular.
- **Simulation Use**: Useful for modeling low-probability events over large volumes, such as system failures, accidents, or customer arrivals in low-traffic situations.


### 5. **Uniform Distribution**

- **Description**: In a uniform distribution, every outcome within a given range has an equal probability of occurring.
- **Application**: Used when modeling events that are equally likely to occur within a range.
- **Example**: Rolling a fair die, where each of the six possible outcomes has an equal chance of appearing.
- **Simulation Use**: Suitable for generating random values without preferences, such as selecting a random item from a list or generating random time intervals.

---

## Conclusion

Understanding different probability distributions allows for better simulation of real-life scenarios where randomness and probabilistic outcomes are essential. Each distribution can effectively model specific types of events, enhancing the accuracy and relevance of simulations.
