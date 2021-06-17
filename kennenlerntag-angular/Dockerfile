FROM node:14-alpine AS build
WORKDIR /usr/src/app
EXPOSE 4200
COPY package.json package-lock.json ./
RUN npm install
COPY . .
CMD ["npm", "run", "start"]
