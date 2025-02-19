# todo

**⚠️ mind:**
- code quality, structure, patterns, comments
- ra, cucumber features use
- correct tests, checks
- regular commits

**steps:**
- [implementation](#implementation)
- [👉 analysis](#-analysis)
- [setup](#setup)

## implementation

feature testing:
- create: get, post + get
- update: get, post + get, put + get
- delete: get, post + get, delete + get
- test incorrect data: post, put
  - string: test some unhappy strings
  - dates: test some unhappy dates

auth:
- authentication: make helper
- test: check user is authenticated
- test: not authenticated: check error 403

test data:
- json schemas: Booking API
- json schemas: Message API
- test data: Booking API
- test data: Message API

## 👉 analysis
- [x] list API endpoints
- [x] review [endpoints](doc/endpoints.md)
- [x] setup api test framework
- 👉 tools doc:
  - cucumber/gherkin features
  - rest assured features
- define tests: show variation, cover enough test types
- write BDD scenarios
- implement step definitions

## setup
- [x] install cucumber
- [x] install rest assured
- [x] vscode: java, xml formatter
- [x] review instructions
- [x] note steps
