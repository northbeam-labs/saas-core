# saas-core

multi-tenant saas core: spring boot, fastapi billing, react app, infra

## architecture

- **`core/`** — spring boot tenant + auth core
- **`billing/`** — fastapi billing + usage
- **`app/`** — react + ts customer app
- **`infra/`** — terraform + k8s

Each service is independently buildable; `docker-compose.yml` wires them
together for local dev.

## running locally

```
docker compose up --build
```

## layout

```
saas-core/
  core/
  billing/
  app/
  infra/
  docker-compose.yml
  Makefile
```

