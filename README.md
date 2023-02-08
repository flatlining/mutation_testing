# Mutation Testing

**Tech Talk: Writing better tests with the help of Mutation Analysis**

Good morning all, 

Will your test suite fail after unwanted code changes?

Code coverage may be one of the most famous metrics for asserting test suite quality, but how useful is it really? How successful are your tests while detecting unwanted behavior changes in your codebase?
With [Mutation Analysis](https://en.wikipedia.org/wiki/Mutation_testing) you can check not only how much of your code is covered with tests, but also if those tests will break in case of bugs, bringing much more safety while developing.

In this presentation Matias Schertel will introduce the concept of Mutation Analysis, basic principles, some live examples (java code), and how his team is using it to deliver safer software.
Target audience: any person that participates on the software development process

Agenda:

- The theory
- The practice (live demo)
- How my team is using it
- Q&A

## Presentation

### Run

```bash
# Go to folder
cd reveal.js
# Build
npm install
# Run
npm start
# Open in browser
```

## Demo Project

```bash
# Go to folder
cd mutation
# Setup java SDK
sdk env
# Build
mvn clean install
# Run mutation coverage
mvn test-compile org.pitest:pitest-maven:mutationCoverage
```

## References

- https://en.wikipedia.org/wiki/Mutation_testing
- https://pitest.org/
- https://github.com/theofidry/awesome-mutation-testing
- https://en.wikipedia.org/wiki/Code_coverage
- https://www.conventionalcommits.org/
