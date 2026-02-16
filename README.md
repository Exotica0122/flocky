# Flocky

A modern monorepo application built with Turborepo.

## Getting Started

### 1. Install Dependencies

```sh
pnpm install
```

### 2. Set Up the Frontend

Copy the example environment file:

```sh
cp apps/web/.env-example apps/web/.env
```

Update the values in `apps/web/.env` as needed. See the [Web README](apps/web/README.md) for more details.

### 3. Set Up the Backend

Follow the setup instructions in the [API README](apps/api/README.md) to configure the database and environment variables.

### 4. Start Development

From the root directory:

```sh
pnpm dev
```

This will start all apps in development mode.
