# Project Template

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Redy1908_Applicativo&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Redy1908_Template)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Redy1908_Applicativo&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Redy1908_Template)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Redy1908_Applicativo&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Redy1908_Template)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=Redy1908_Applicativo&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=Redy1908_Template)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Redy1908_Applicativo&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Redy1908_Template)

> **Important:** After forking this repository, you **must** edit this `README.md` file. Replace all instances of `Redy1908_Applicativo` in the above links with  `YourGithHubUsername_Applciativo`. Once you have done this, and followed the setup instructions below, you can delete this note and the insstructions.

---

This repository serves as a base template for programming projects. It comes pre-configured with:
*   Java 21
*   Maven for dependency and build management
*   JUnit 5 for unit testing
*   A Continuous Integration (CI) workflow with GitHub Actions that automates builds, tests, and code quality analysis.
*   Integration with SonarCloud for static code analysis.

---

## Initial Setup

Fork this repository.

Create your own organization on SonarCloud, linked to your GitHub account.

1.  **Log in to SonarCloud**: Go to [SonarCloud.io](https://sonarcloud.io/) and log in with your GitHub account.
2.  **Create a New Organization**:
    *   Click the `+` icon in the top-right corner and select **Create new organization**.
    *   SonarCloud will ask you to choose a GitHub account to link. Select your personal GitHub account and grant permissions.
    *   You will be prompted for an **Organization Key**. This is a critical step. By default, SonarCloud will suggest your GitHub username in lowercase, you can use that or customize it. Just make sure to edit the `pom.xml` file in this repository to replace `YOUR-UNIQUE-ORGANIZATION-KEY` at [this line](https://github.com/Redy1908/Applicativo/blob/62282920333c8979f8903ff3b23c70ee2e672b98/pom.xml#L15) with the exact key you choose here.
    *   Choose the **Free plan** and click "Create Organization".
3.  **Add Your Project to the New Organization**:
    *   After creating the organization, you will be prompted to import a project. If not, click the `+` icon again and select **Analyze new project**.
    *   Make sure you are in the correct organization (the one you just created).
    *   Select your project repository from the list and click **Set Up**.
4.  **Disable Automatic Analysis**:
    *   Once the project is set up, you will be on the project's main page.
    *   Go to **Administration** > **Analysis Method**.
    *   Turn **OFF** the "SonarCloud Automatic Analysis" toggle. Our custom GitHub Actions workflow will handle the analysis.

### 3. Generate a SonarCloud Access Token

The GitHub Actions workflow needs a token to authenticate and send data to your new SonarCloud organization.

1.  On SonarCloud, click your profile icon in the top right corner and go to **My Account**.
2.  Select the **Security** tab.
3.  Under "Generate Tokens", enter a name for your token (e.g., `github-token`) and click **Generate**.
4.  **Copy the generated token and save it temporarily.** You will not be able to see it again.

### 4. Add the Token to GitHub Secrets

Now you need to securely add the token to your GitHub repository.

1.  Go to your GitHub repository (the one created from the template).
2.  Click on **Settings** > **Secrets and variables** > **Actions**.
3.  Click the **New repository secret** button.
4.  Fill in the fields:
    *   **Name**: `SONAR_TOKEN` (the name must be exact).
    *   **Secret**: Paste the token you copied from SonarCloud.
5.  Click **Add secret**.

**Done!** Your project is now fully configured.

---

## How It Works

From now on, the process is automatic:

*   **On every `push` to the `main` branch**: GitHub Actions will trigger the workflow, compile the code, run the tests, and send a full analysis to SonarCloud, updating the project's dashboard.
*   **When you open a `Pull Request`**: The workflow will run, and SonarCloud will post a **summary comment** directly on the Pull Request page, showing you the impact of your changes on code quality before you even merge them.

You can monitor the status of each run in the **"Actions"** tab of your repository.
