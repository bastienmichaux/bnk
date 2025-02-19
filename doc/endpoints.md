# doc/endpoints

[Booking API](https://automationintesting.online/booking/swagger-ui/index.html#/):
- `/`: get, post: need room id, token
- `/{id}`: get, put, delete: need id, token
- `/summary`: get: need room id

[Message API](https://automationintesting.online/message/swagger-ui/index.html#/):
- `/`: get, post
- `/{id}`: get, delete: need id, token
- `/{id}/read`: put: need id, token
- `/count`: get

Booking API schemas:
- `Booking`
- `BookingDates`
- `CreatedBooking`

Message API schemas:
- `Message`
- `Messages`
- `MessageSummary`
- `Count`
