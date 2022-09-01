# Task 13 - import-data-xls

Rabu, 31 Agustus 2022

Crud data provinsi dan kota menggunakan JAVA Spring Boot.

## Arsitektur

1. Database PostgreSQL
2. SpringBoot untuk REST API
3. Apache POI

Dokumentasi API : https://www.getpostman.com/collections/0c4548ed3f0d0d90370a

## HTTP Request Sample

### Import data (POST)

<pre>
curl --location --request POST 'http://localhost/import-xls/api/import' \
--form 'file=@"/C:/Users/Yansen/Downloads/schedule_coin_price_history_500.xlsx"'
</pre>


