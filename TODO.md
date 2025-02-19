# todo

**⚠️ mind:**
- code quality, structure, patterns, comments
- ra, cucumber features use
- correct tests, checks
- regular commits
- show variation, cover enough test types

**steps:**
- [👉 implementation](#-implementation)
- [analysis](#analysis)
- [documentation](#documentation)
- [setup](#setup)

## 👉 implementation

message API:
- [x] base scenarios Gherkin
- 👉 implement before all
- implement after all

auth API:
- implement login
- implement logout
- implement validate
- authentication: make helper
- test: check user is authenticated
- test: not authenticated: check error 403

step definitions:
- implement before all
- implement after all
- methods:
  - get request
  - post request
  - delete request
  - put request
- response validation

gherkin features:
- use expressions: string, int
- use data tables?
- use tags?

feature testing:
- create: get, post + get
- update: get, post + get, put + get
- delete: get, post + get, delete + get
- test incorrect data: post, put
  - string: test some unhappy strings
  - dates: test some unhappy dates

test data:
- json schemas: Booking API
- json schemas: Message API
- test data: Booking API
- test data: Message API

nice to have:
- best practices: cucumber anti-patterns: use AND

## analysis
- [x] list API endpoints
- [x] review [endpoints](doc/endpoints.md)
- [x] setup api test framework
- tools doc:
  - cucumber/gherkin features
  - rest assured features
- [x] define tests: message API
- 👉 implement step definitions

## documentation
- [endpoints](doc/endpoints.md)
- [Message API](doc/api.message.md)
- [Auth API](doc/api.auth.md)

nice to have:
- [Booking API](doc/api.booking.md)

## setup
- [x] install cucumber
- [x] install rest assured
- [x] vscode: java, xml formatter
- [x] review instructions
- [x] note steps
