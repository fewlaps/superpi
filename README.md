# superpi
If you are a hardware nerd like me, you know SuperPI for sure. If not, SuperPI is a Windows application useful to benchmark your CPU.

As there's any simple way to benchmark servers performance, we written this project that tests your CPU without installing nothing: simply running the image on Docker

```bash
docker run fewlaps/superpi
```

By default, the app runs 32 threads and 1000000000 iterations over the Gauss-Legendre algorithm to approximate the Pi decimals. If you want to customize that numbers, don't hesitate to do it:

```bash
docker run fewlaps/superpi -t numberOfThreads
docker run fewlaps/superpi -i numberOfIterations
docker run fewlaps/superpi -t numberOfThreads -i numberOfIterations
```
