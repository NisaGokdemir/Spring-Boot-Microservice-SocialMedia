# Spring Boot Microservice Social Media

Bu proje, Spring Boot kullanılarak geliştirilmiş basit bir mikro servis tabanlı sosyal medya demo uygulamasıdır.


## 📌 İçerdiği Servisler

- **Auth Service**: Kullanıcı kimlik doğrulama işlemlerini yönetir. **PostgreSQL** veritabanı kullanır.
- **User Profile Service**: Kullanıcı profillerini yönetir. **MongoDB** veritabanı kullanır.
- **Config Server**: Mikro servislerin yapılandırmalarını merkezi olarak yönetir. Yapılandırma dosyalarını **GitHub** üzerinden çeker.
- **Redis**: Önbellekleme amacıyla projede yer almaktadır, ancak kullanım alanı sınırlıdır.
- **Feign Client**: Servisler arası iletişim için kullanılmıştır.

## 🛠 Kullanılan Teknolojiler

- **Spring Boot**
- **Spring Cloud Config Server**
- **Spring Cloud OpenFeign** 
- **Spring Data JPA & PostgreSQL** 
- **Spring Data MongoDB**
- **Redis**
- **Gradle**
- **Swagger (OpenAPI)**

## 📌 API Uç Noktaları

| Servis | HTTP Yöntemi | Endpoint |
|--------|-------------|----------|
| **Auth Service** | `POST` | `/dev/v1/auth/register` |
| **Auth Service** | `POST` | `/dev/v1/auth/Login` |
| **User Profile Service** | `POST` | `/dev/v1/user-profile/create-user` |
| **User Profile Service** | `GET` | `/dev/v1/user-profile/upper-name` |
| **User Profile Service** | `GET` | `/dev/v1/user-profile/get-all` |

Swagger dökümantasyonu ile API'leri test edebilirsiniz:
http://localhost:<PORT>/swagger-ui/index.html


## 📌 Notlar

- Proje **demo** amaçlıdır, API uç noktaları sınırlıdır.
- **Redis**, önbellekleme için kullanılabilir ancak entegrasyonu minimaldir.
- **Config Server**, **GitHub** üzerinden yapılandırma dosyalarını alır.
- Servisler arası iletişim için **Feign Client** kullanılmıştır.

## 🚀 Kurulum ve Çalıştırma

Projeyi çalıştırmak için aşağıdaki adımları takip edebilirsiniz:

### Depoyu Klonlayın

```sh
git clone https://github.com/NisaGokdemir/Spring-Boot-Microservice-SocialMedia.git
cd Spring-Boot-Microservice-SocialMedia
```

### Config Server'ı Çalıştırın
Config Server, GitHub üzerinden yapılandırma dosyalarını çeker. Config Server'ı çalıştırmak için:

```sh
cd config-server
./gradlew bootRun
```


### Veritabanlarını Ayarlayın
PostgreSQL ve MongoDB'nin çalıştığından emin olun.
auth-service PostgreSQL kullanır, user-profile-service ise MongoDB kullanır.
Gerekirse application.yml ve environment değişkenlerini düzenleyin.

### Servisleri Başlatın
Her servisi ayrı terminal sekmelerinde başlatabilirsiniz:


Auth Service (Kimlik Doğrulama)
```sh
cd auth-service
./gradlew bootRun
```



User Profile Service (Kullanıcı Profili)
```sh
cd user-profile-service
./gradlew bootRun
```
