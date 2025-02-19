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

basic implementation setup:
- gherkin scenario
- rest assured step defs

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
- [x] list endpoints for
  - https://automationintesting.online/booking/swagger-ui/index.html
  - https://automationintesting.online/message/swagger-ui/index.html
- review [endpoints](doc/endpoints.md)
- define tests: show variation, cover enough test types
- setup api test framework
  - write bdd scenario
  - step definitions

## setup
- [x] install cucumber
- [x] install rest assured
- [x] vscode: java, xml formatter
- [x] review instructions
- [x] note steps
