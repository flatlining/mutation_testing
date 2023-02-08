# Bundle

```bash
# Bundle and encrypt
git bundle create main.bundle HEAD main && gpg --output main.bin --encrypt --sign --recipient <key> main.bundle && rm main.bundle
# Decrypt and clone
gpg --output main.bundle --decrypt main.bin && git clone main.bundle mutation_testing && rm main.bundle
```

## References

- https://initialcommit.com/blog/git-bundle
- https://www.gnupg.org/gph/en/manual/x110.html
- https://www.howtogeek.com/427982/how-to-encrypt-and-decrypt-files-with-gpg-on-linux/
- https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/removing-sensitive-data-from-a-repository
- https://rtyley.github.io/bfg-repo-cleaner/
