All refactored code placed in refactored package
___
# Code Review Issues

1. The reading file functionality has been moved to a separate utility class, improving code modularity.
2. Exception handling has been implemented to handle errors more gracefully, enhancing the robustness of the code.
3. The logic for extracting words has been moved to a separate utility class, promoting code reuse.
4. Unnecessary sorting of words has been removed, optimizing the code for performance.
5. Empty strings are now filtered out, and whitespace is trimmed from words, improving data quality.
6. The logic for counting and grouping words has been completely rewritten, resulting in a significant decrease in execution time (from 1200ms to 120ms on average).
7. A utility class for measuring the execution time of methods has been added, aiding in performance analysis.
8. The `txt` folder has been renamed to `assets` for better clarity and consistency.
9. Add a private constructor to hide the implicit public one.
10. Use Logger instead of System.out.

These improvements aim to enhance code readability, maintainability, and performance, leading to a more efficient and reliable application.
