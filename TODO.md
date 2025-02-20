# todo

**⚠️ mind:**
- code quality, structure, patterns, comments
- ra, cucumber features use
- correct tests, checks
- regular commits
- show variation, cover enough test types

**steps:**
- [documentation](#documentation)
- [👉 implementation](#-implementation)
  - [message APi](#message-api)
  - [auth API](#auth-api)
  - [👉 functional testing](#-functional-testing)
  - [nice to have](#nice-to-have)
- [analysis](#analysis)
- [setup](#setup)

## documentation

- [endpoints](doc/endpoints.md)
- [Message API](doc/api.message.md)
- [Auth API](doc/api.auth.md)

## 👉 implementation

### message APi

- [x] base scenarios Gherkin
- [x] before all: set base url
- after all: auth logout

### auth API

- [x] implement login
- implement logout
- implement validate
- authentication: make helper
- test: check user is authenticated
- test: not authenticated: check error 403

### 👉 functional testing

framework:
- methods:
  - [x] get request
  - 👉 post request
  - delete request
  - put request
- response validation
  - [x] is
  - [x] greater or equal to
  - [x] JSON body
- gherkin syntax:
  - [x] use expressions: string, int
  - use data tables?
  - use tags?
  - before all: gherkin + RA
  - after all: gherkin + RA

tests:
- 👉 POST: create: get, post + get
- PUT: update: get, post + get, put + get
- DELETE: get, post + get, delete + get
- test incorrect data: post, put
  - string: test some unhappy strings
  - dates: test some unhappy dates

test data:
- use Objects with `@JSONProperty` fields
- json schemas: Booking API
- json schemas: Message API
- test data: Booking API
- test data: Message API

### nice to have

- best practices: cucumber anti-patterns: use AND
- reporting config
- javadoc
- security testing

## analysis

- [x] list API endpoints
- [x] review [endpoints](doc/endpoints.md)
- [x] setup api test framework
- [x] define tests: message API
- tools doc:
  - cucumber/gherkin features
  - rest assured features

nice to have:
- define tests: [Booking API](doc/api.booking.md)

## setup
- [x] install cucumber
- [x] install rest assured
- [x] vscode: java, xml formatter
- [x] review instructions
- [x] note steps
