[![Stories in Ready](https://badge.waffle.io/antonmry/netapps-workflow.png?label=ready&title=Ready)](https://waffle.io/antonmry/netapps-workflow) [![Join the chat at https://gitter.im/antonmry/netapps-workflow](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/antonmry/netapps-workflow?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

# netapps-workflow

Basic repository to explain how we work with github and waffle

* Go to [Waffle](https://waffle.io/antonmry/netapps-workflow) and choose an issue in the Ready column (weekly sprint)
* Now clone the repository:

```sh
git clone https://waffle.io/antonmry/netapps-workflow
```

* Create the branch:

```sh
git checkout -b gradle-test#11
git push -u origin gradle-test#11
```

It moves the issue to the column "In Progress" and assign the task to your user. 

* Commit locally and remotely

```sh
git commit -m "Message"
git push
```

* It's time to do the PR, better to avoid the "git request-pull" command and use github with a title like "Closes #11 Maven and spock tests"

It moves the issue to the column "Needs review". 

* Another team member review the PR and merge it. 

1. From your project repository, bring in the changes and test:

```sh
git fetch origin
git checkout -b gradle-test#11 origin/gradle-test#11
git merge master
```


2. Merge the changes and update on GitHub:

```sh
git checkout master
git merge --no-ff gradle-test#11
git push origin master
```

It moves the issue to the column "Done" and closes in Github. 

As reference, visit [Recommended Workflow Using Pull Requests & Automatic Work Tracking](https://github.com/waffleio/waffle.io/wiki/Recommended-Workflow-Using-Pull-Requests-&-Automatic-Work-Tracking)
