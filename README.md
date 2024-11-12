# hpa-jvm-gc-demo

Pre requisitos
- CLI do Quarkus
- `brew install k6`
- `k6 login cloud --token <TOKEN CLOUD GRAFANA CLOUD>`


Deploy app

```quarkus build```

Rodar o teste e subir resultado na nuvem

```k6 run --out=cloud local-test.js`


Alterar deployment

```yaml
resources:
            limits:
              memory: 200Mi
              cpu: 100m
            requests:
              memory: 100Mi
              cpu: 50m
```

